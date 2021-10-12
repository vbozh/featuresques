package codeAnalysis;

public final class LicenseInfo {
    private final String name;
    private final String textUrl;

    LicenseInfo(String name, String textUrl) {
        this.name = name;
        this.textUrl = textUrl;
    }

    public String getName() {
        return name;
    }

    public String getTextUrl() {
        return textUrl;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicenseInfo)) return false;

        LicenseInfo that = (LicenseInfo) o;

        if (!name.equals(that.name)) return false;
        return textUrl.equals(that.textUrl);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + textUrl.hashCode();
        return result;
    }
}