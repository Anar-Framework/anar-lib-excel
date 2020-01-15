
package af.gov.anar.lib.excel.test.props.sheet;

import af.gov.anar.lib.excel.Props;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Fit to page.
 */
public final class FitToPage implements Props<Sheet> {

    /**
     * Fit to page.
     */
    private final boolean value;

    /**
     * Ctor.
     * @param fit Fit to page
     */
    public FitToPage(final boolean fit) {
        this.value = fit;
    }

    @Override
    public void accept(final Sheet sheet) {
        sheet.setFitToPage(this.value);
    }
}
