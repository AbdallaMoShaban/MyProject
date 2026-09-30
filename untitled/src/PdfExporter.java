public class PdfExporter implements Exporter{
    @Override
    public void Export(Report report) {
        ConfigurationManager manager=ConfigurationManager.getInstance();
        System.out.println("===============Company Report as PDf===============");
        System.out.println("company name "+manager.getCompanyName());
        System.out.println("File Path "+manager.getFilePath());
        System.out.println("company Language "+manager.getLanguage());
        System.out.println("===============Header===============");
        System.out.println(report.getHeader());
        System.out.println("===============Body===============");
        System.out.println(report.getBody());
        System.out.println("===============Footer===============");
        System.out.println(report.getFooter());
        System.out.println("====================================================");
    }
}