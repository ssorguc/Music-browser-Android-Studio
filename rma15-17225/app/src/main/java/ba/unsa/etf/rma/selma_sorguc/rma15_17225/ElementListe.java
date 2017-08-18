package ba.unsa.etf.rma.selma_sorguc.rma15_17225;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by ETF-LAB-1-11 on 3/11/2016.
 */
public class ElementListe extends ListView {
    public ElementListe(Context context) {
        super(context);
    }
    public ElementListe(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public ElementListe(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    private void init(){
    }
    @Override
    public void onDraw(Canvas canvas) {
        // Use the base TextView to render the text.
        super.onDraw(canvas);
    }
}