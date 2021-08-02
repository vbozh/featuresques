import java.util.ArrayList;
import java.util.List;

/**
 * Class that contain information needed to comply with library licenses.
 */
public final class Attribution implements Comparable<Attribution> {

    private final String name;
    private final List<String> copyrightNotices;
    private final List<LicenseInfo> licensesInfo;
    private final String website;

    private Attribution(String name, List<String> copyrightNotices, List<LicenseInfo> licensesInfo, String website) {
        this.name = name;
        this.copyrightNotices = copyrightNotices;
        this.licensesInfo = licensesInfo;
        this.website = website;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getCopyrightNotices() {
        return this.copyrightNotices;
    }

    public String getFormattedCopyrightNotices() {
        StringBuilder builder = new StringBuilder();
        for (String copyrightNotice : this.copyrightNotices) builder.append("\n").append(copyrightNotice);
        return builder.toString().replaceFirst("\n", "");
    }

    public List<LicenseInfo> getLicensesInfo() {
        return this.licensesInfo;
    }

    public String getWebsite() {
        return this.website;
    }

    @Override
    public int compareTo(Attribution o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attribution)) return false;

        Attribution that = (Attribution) o;

        if (!this.name.equals(that.name)) return false;

        for (String copyrightNotice : this.copyrightNotices)
            if (!that.copyrightNotices.contains(copyrightNotice)) return false;

        for (LicenseInfo licenseInfo : this.licensesInfo) if (!that.licensesInfo.contains(licenseInfo)) return false;

        return this.website.equals(that.website);
    }

    @Override
    public int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + this.copyrightNotices.hashCode();
            result = 31 * result + this.licensesInfo.hashCode();
            result = 31 * result + this.website.hashCode();
            return result;
        }

    public static class Builder {
        private final String name;
        private final List<String> copyrightNotices;
        private final List<LicenseInfo> licenseInfos;
        private String website;

        public Builder(String name) {
            this.name = name;
            this.copyrightNotices = new ArrayList<>();
            this.licenseInfos = new ArrayList<>();
            this.website = "";
        }

        public Builder addCopyrightNotice(String notice) {
            this.copyrightNotices.add(notice);
            return this;
        }

        public Builder addCopyrightNotice(String copyrightHolder, String year) {
            this.copyrightNotices.add("Copyright " + year + " " + copyrightHolder);
            return this;
        }

        public Builder addLicense(String name, String textUrl) {
            this.licenseInfos.add(new LicenseInfo(name, textUrl));
            return this;
        }

        public Builder addLicense(License license) {
            this.licenseInfos.add(license.getLicenseInfo());
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Attribution build() {
            return new Attribution(this.name, this.copyrightNotices, this.licenseInfos, this.website);
        }
    }
}