package pages;

public class PaginaPrincipal extends BasePage {
    public PaginaPrincipal(){
        super(driver);
    }
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }
    public void navigateToYoutube(){
        navigateTo("https://www.youtube.com/watch?v=q6YQqoGLAhU");
    }
}
