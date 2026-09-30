public class ConfigurationManager {
    private final String companyName;
    private final String filePath;
    private final String language;
    private  static ConfigurationManager manager;
    private ConfigurationManager(){
        this.companyName="Ams Group for tech solution";
        this.filePath="D:\\Route Course\\Route-Assignment\\untitled";
        this.language="English";
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getLanguage() {
        return language;
    }
    public static ConfigurationManager getInstance(){
        if (manager==null){
            return new
                    ConfigurationManager();
        }

        return manager;
    }
}