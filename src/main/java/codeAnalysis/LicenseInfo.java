package codeAnalysis;

public final class LicenseInfo {
    private final String re_rename;
    private final String textUrl;

    LicenseInfo(String rename, String textUrl) {
        this.re_rename = rename;
        this.textUrl = textUrl;
    }

    public String getName() {
        return this.re_rename;
    }

    public String getTextUrl() {
        return this.textUrl;
    }

    public String toString() {
        return this.re_rename;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicenseInfo)) return false;

        LicenseInfo that = (LicenseInfo) o;

        if (!this.re_rename.equals(that.re_rename)) return false;
        return this.textUrl.equals(that.textUrl);

    }

    @Override
    public int hashCode() {
        int result = this.re_rename.hashCode();
        result = 31 * result + this.textUrl.hashCode();
        return result;
    }
}