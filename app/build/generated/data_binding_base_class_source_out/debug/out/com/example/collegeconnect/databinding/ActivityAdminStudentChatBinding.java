// Generated by view binder compiler. Do not edit!
package com.example.collegeconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.collegeconnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminStudentChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Spinner branch;

  @NonNull
  public final Button button11;

  @NonNull
  public final RecyclerView rvNewMessage;

  @NonNull
  public final Spinner sections;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final Spinner years;

  private ActivityAdminStudentChatBinding(@NonNull ConstraintLayout rootView,
      @NonNull Spinner branch, @NonNull Button button11, @NonNull RecyclerView rvNewMessage,
      @NonNull Spinner sections, @NonNull TextView textView11, @NonNull TextView textView20,
      @NonNull TextView textView9, @NonNull Spinner years) {
    this.rootView = rootView;
    this.branch = branch;
    this.button11 = button11;
    this.rvNewMessage = rvNewMessage;
    this.sections = sections;
    this.textView11 = textView11;
    this.textView20 = textView20;
    this.textView9 = textView9;
    this.years = years;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminStudentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminStudentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_student_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminStudentChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.branch;
      Spinner branch = rootView.findViewById(id);
      if (branch == null) {
        break missingId;
      }

      id = R.id.button11;
      Button button11 = rootView.findViewById(id);
      if (button11 == null) {
        break missingId;
      }

      id = R.id.rv_new_message;
      RecyclerView rvNewMessage = rootView.findViewById(id);
      if (rvNewMessage == null) {
        break missingId;
      }

      id = R.id.sections;
      Spinner sections = rootView.findViewById(id);
      if (sections == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = rootView.findViewById(id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = rootView.findViewById(id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.years;
      Spinner years = rootView.findViewById(id);
      if (years == null) {
        break missingId;
      }

      return new ActivityAdminStudentChatBinding((ConstraintLayout) rootView, branch, button11,
          rvNewMessage, sections, textView11, textView20, textView9, years);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
