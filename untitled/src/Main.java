public class Main {
    void  main() {
    ConfigurationManager manager=ConfigurationManager.getInstance();
        System.out.println("loading company system "+manager.getCompanyName());
        Report myReport=new Report.Builder("this is the body ").setHeader("header")
                .setFooter("footer")
                .build();
        Factory factory=new Factory();
        Exporter export =factory.choose("html");
        export.Export(myReport);


    }
}