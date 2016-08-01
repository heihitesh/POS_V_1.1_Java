package HelpingLitrals;

/**
 * Created by Nilesh Verma on 01-Aug-16.
 */
public class hl_UPDATE {
    private float latestVersion;
    private String releasedDate;
    private String description;
    private String downloadingLink;

    public void setLatestVersion(float latestVersion) {
        this.latestVersion = latestVersion;
    }

    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDownloadingLink(String downloadingLink) {
        this.downloadingLink = downloadingLink;
    }

    public float getLatestVersion() {
        return latestVersion;
    }

    public String getReleasedDate() {
        return releasedDate;
    }

    public String getDownloadingLink() {
        return downloadingLink;
    }

    public String getDescription() {
        return description;
    }
}
