// Generated by view binder compiler. Do not edit!
package com.example.collegeconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.collegeconnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStudentChangePasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button4;

  @NonNull
  public final EditText confirmpass;

  @NonNull
  public final EditText currentpass;

  @NonNull
  public final EditText newpass;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView32;

  @NonNull
  public final TextView textview23;

  private ActivityStudentChangePasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button button4, @NonNull EditText confirmpass, @NonNull EditText currentpass,
      @NonNull EditText newpass, @NonNull TextView textView10, @NonNull TextView textView12,
      @NonNull TextView textView32, @NonNull TextView textview23) {
    this.rootView = rootView;
    this.button4 = button4;
    this.confirmpass = confirmpass;
    this.currentpass = currentpass;
    this.newpass = newpass;
    this.textView10 = textView10;
    this.textView12 = textView12;
    this.textView32 = textView32;
    this.textview23 = textview23;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStudentChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStudentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_student_change_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStudentChangePasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button4;
      Button button4 = rootView.findViewById(id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.confirmpass;
      EditText confirmpass = rootView.findViewById(id);
      if (confirmpass == null) {
        break missingId;
      }

      id = R.id.currentpass;
      EditText currentpass = rootView.findViewById(id);
      if (currentpass == null) {
        break missingId;
      }

      id = R.id.newpass;
      EditText newpass = rootView.findViewById(id);
      if (newpass == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView32;
      TextView textView32 = rootView.findViewById(id);
      if (textView32 == null) {
        break missingId;
      }

      id = R.id.textview23;
      TextView textview23 = rootView.findViewById(id);
      if (textview23 == null) {
        break missingId;
      }

      return new ActivityStudentChangePasswordBinding((ConstraintLayout) rootView, button4,
          confirmpass, currentpass, newpass, textView10, textView12, textView32, textview23);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}