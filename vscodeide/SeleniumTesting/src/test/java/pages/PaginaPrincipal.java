package pages;

public class PaginaPrincipal extends BasePage {
    private String searchButton = "//*[@id=\"page_section_48252437\"]/div/section/div[2]";
    
    public PaginaPrincipal(){
        super(driver);
    }
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }
    public void navigateToYoutubeEnglish(){
        navigateTo("https://www.youtube.com/watch?v=q6YQqoGLAhU");
    }
    public void navigateToYoutubeSWE(){
        navigateTo("https://www.youtube.com/watch?v=_nVB2B-M3rs");
    }
}
