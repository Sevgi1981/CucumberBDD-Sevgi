package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class guru99Telecom extends BrowserUtils {

    public guru99Telecom () {
        PageFactory.initElements(Driver.getDriver(), this);    }

    private static final Logger logger= Logger.getLogger(guru99Telecom.class);

}
