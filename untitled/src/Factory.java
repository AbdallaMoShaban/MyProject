public class Factory {
        public Exporter choose(String s){
            if (s.equalsIgnoreCase("pdf")){
                return new PdfExporter();
            }else if (s.equalsIgnoreCase("html")){
                        return new HtmlExporter();
            }
            throw new IllegalArgumentException("Not supported" + s);

        }
}