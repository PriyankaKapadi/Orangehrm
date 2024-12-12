import org.testng.annotations.Test;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.utils.readPropertyFile;

public class Log {
	@Test
	public static void openBrowserAndLaunchUrl() {
		Keywords.openBrowser(readPropertyFile.getBrowserName());
		Keywords.launchUrl(readPropertyFile.getLaunchUrl("qa"));
	}
}
