public class Report {
    private final String footer;
    private final String body;
    private final String header;

    public Report(Builder builder ) {
       this.footer=builder.footer;
       this.body=builder.body;
       this.header=builder.header;
    }

    public String getFooter() {
        return footer;
    }

    public String getBody() {
        return body;
    }

    public String getHeader() {
        return header;
    }

    public static class Builder{
    private  String footer;
    private final String body;
    private  String header;

    public Builder( String body) {
        this.body = body;
    }
    public  Builder setFooter(String footer){
        this.footer=footer;
        return this;
    }
    public  Builder setHeader(String header){
        this.header=header;
        return this;
    }
    public Report build(){
        return new Report(this);
    }

    public String getFooter() {
        return footer;
    }

    public String getBody() {
        return body;
    }

    public String getHeader() {
        return header;
    }
}}