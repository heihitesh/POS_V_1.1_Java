package Settings;

/**
 * Created by Nilesh Verma on 01-Aug-16.
 */
public class MyUpdatePojo {

    private MyUpdatePojo.HitInventory HitInventory;

    public MyUpdatePojo.HitInventory getHitInventory() {
        return HitInventory;
    }

    public void setHitInventory(MyUpdatePojo.HitInventory HitInventory) {
        this.HitInventory = HitInventory;
    }

    @Override
    public String toString() {
        return "ClassPojo [HitInventory = " + HitInventory + "]";
    }


    /**
     * Created by Nilesh Verma on 29-Oct-16.
     */
    public class HitInventory {
        private String description;

        private String date;

        private String downloading_link;

        private String version;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDownloading_link() {
            return downloading_link;
        }

        public void setDownloading_link(String downloading_link) {
            this.downloading_link = downloading_link;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        @Override
        public String toString() {
            return "ClassPojo [description = " + description + ", date = " + date + ", downloading_link = " + downloading_link + ", version = " + version + "]";
        }
    }
}
