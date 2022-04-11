package tad.in.task.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AlertDialog;

import tad.in.task.R;


public class LoaderDialog extends AlertDialog {

    public LoaderDialog(Context context) {
        super(context);

        setCancelable(false);
        setCanceledOnTouchOutside(false);

        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_loader, null);
        this.setView(dialogView);

        try {
            getWindow().setLayout(
                    WindowManager.LayoutParams.MATCH_PARENT,
                    WindowManager.LayoutParams.MATCH_PARENT
            );
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            InputMethodManager imm = (InputMethodManager) ((Activity) context).getSystemService(Activity.INPUT_METHOD_SERVICE);
            View view = ((Activity) context).getCurrentFocus();
            if (view == null) {
                view = new View(context);
            }
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        ImageView imageView = (ImageView) dialogView.findViewById(R.id.iv_loader);

//        ObjectAnimator animation = ObjectAnimator.ofFloat(imageView, "rotationY", 0.0f, 360f);
//        animation.setDuration(500);
//        animation.setRepeatCount(ObjectAnimator.INFINITE);
//        animation.setInterpolator(new AccelerateDecelerateInterpolator());
//        animation.start();

    }

}
