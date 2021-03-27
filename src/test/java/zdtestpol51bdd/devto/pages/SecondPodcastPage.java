package zdtestpol51bdd.devto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPodcastPage {
    WebDriver driver;
    @FindBy(tagName = "h3")
    public WebElement firstCast;

    @FindBy(id = "record")
    public WebElement recordButton;

    @FindBy(className = "status-message")
    public WebElement initializing;

    @FindBy(xpath = "//img[contains(@class,'pause-butt')]" )
    public WebElement pauseBtn;


    public SecondPodcastPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void selectfirstCast() { firstCast.click(); }

    public void selectrecordButton() { recordButton.click();}


}
