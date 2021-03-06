// Generated by view binder compiler. Do not edit!
package com.example.collegeconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.collegeconnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button rcBtn;

  @NonNull
  public final TextView rctxtname;

  private ListItemBinding(@NonNull CardView rootView, @NonNull Button rcBtn,
      @NonNull TextView rctxtname) {
    this.rootView = rootView;
    this.rcBtn = rcBtn;
    this.rctxtname = rctxtname;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rcBtn;
      Button rcBtn = rootView.findViewById(id);
      if (rcBtn == null) {
        break missingId;
      }

      id = R.id.rctxtname;
      TextView rctxtname = rootView.findViewById(id);
      if (rctxtname == null) {
        break missingId;
      }

      return new ListItemBinding((CardView) rootView, rcBtn, rctxtname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
