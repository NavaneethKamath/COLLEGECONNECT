// Generated by view binder compiler. Do not edit!
package com.example.collegeconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.collegeconnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FacLatestMessageRowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView newMsgImg;

  @NonNull
  public final TextView newMsgText;

  @NonNull
  public final TextView textViewForId;

  @NonNull
  public final TextView toId;

  private FacLatestMessageRowBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView newMsgImg, @NonNull TextView newMsgText, @NonNull TextView textViewForId,
      @NonNull TextView toId) {
    this.rootView = rootView;
    this.newMsgImg = newMsgImg;
    this.newMsgText = newMsgText;
    this.textViewForId = textViewForId;
    this.toId = toId;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FacLatestMessageRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FacLatestMessageRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fac_latest_message_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FacLatestMessageRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.new_msg_img;
      ImageView newMsgImg = rootView.findViewById(id);
      if (newMsgImg == null) {
        break missingId;
      }

      id = R.id.new_msg_text;
      TextView newMsgText = rootView.findViewById(id);
      if (newMsgText == null) {
        break missingId;
      }

      id = R.id.text_view_for_id;
      TextView textViewForId = rootView.findViewById(id);
      if (textViewForId == null) {
        break missingId;
      }

      id = R.id.toId;
      TextView toId = rootView.findViewById(id);
      if (toId == null) {
        break missingId;
      }

      return new FacLatestMessageRowBinding((ConstraintLayout) rootView, newMsgImg, newMsgText,
          textViewForId, toId);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
