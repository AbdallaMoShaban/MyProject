public class HtmlExporter implements Exporter{
    @Override
    public void Export(Report report) {
    ConfigurationManager manager=ConfigurationManager.getInstance();
        System.out.println("===============Company Report as HTML===============");
        System.out.println("company name "+manager.getCompanyName());
        System.out.println("File Path "+manager.getFilePath());
        System.out.println("company Language "+manager.getLanguage());
        System.out.println("<H1> "+report.getHeader()+" <H1>");
        System.out.println("<P> "+report.getBody()+" <P>");
        System.out.println("Footer "+report.getFooter()+" Footer");
        System.out.println("====================================================");
    }
}