package af.gov.anar.lib.excel.cells;


/**
 * Multiple cells which styles can be edited.
 */
abstract class AbstractStyleableCells implements ECells {

    @Override
    public final ECells with(final Style style) {
        return new ECells.WithStyle(this, style);
    }
}
