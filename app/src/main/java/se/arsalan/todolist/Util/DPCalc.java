package se.arsalan.todolist.Util;

import android.content.res.Resources;
import android.util.TypedValue;

public class DPCalc {

    public static float dpIntoPx(Resources r, int dp){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
    }
}
