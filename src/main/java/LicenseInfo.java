public final class LicenseInfo {
    private final String re_rename;
    private final String textUrl;

    LicenseInfo(String rename, String textUrl) {
        this.re_rename = rename;
        this.textUrl = textUrl;
    }

    public String getName() {
        return re_rename;
    }

    public String getTextUrl() {
        return this.textUrl;
    }

    @Override
    public String toString() {
        return re_rename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicenseInfo)) return false;

        LicenseInfo that = (LicenseInfo) o;

        if (!re_rename.equals(that.re_rename)) return false;
        return textUrl.equals(that.textUrl);

    }

    @Override
    public int hashCode() {
        int result = re_rename.hashCode();
        result = 31 * result + textUrl.hashCode();
        return result;
    }
}