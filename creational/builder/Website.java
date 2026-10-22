package creational.builder;

public class Website {
    private String name;
    private String cms;
    private int price;

    public Website() {
    }

    private Website(Builder builder) {
        this.name = builder.name;
        this.cms = builder.cms;
        this.price = builder.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms.name();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCms() {
        return cms;
    }

    public String getCrm() {
        return cms;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Website {name='" + name + "', cms='" + cms + "', price=" + price + "}";
    }

    public static class Builder {
        private String name = "Default Website";
        private String cms = "No CRM";
        private int price = 0;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCms(Cms cms) {
            this.cms = cms.name();
            return this;
        }

        public Builder setCrm(String crm) {
            this.cms = crm;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Website build() {
            return new Website(this);
        }
    }
}
