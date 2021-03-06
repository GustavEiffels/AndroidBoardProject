// Generated by view binder compiler. Do not edit!
package com.sing.board4_3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sing.board4_3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBoardModifyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView boardModifyImage;

  @NonNull
  public final EditText boardModifySubject;

  @NonNull
  public final EditText boardModifyText;

  @NonNull
  public final Toolbar boardModifyToolbar;

  @NonNull
  public final Spinner boardModifyType;

  private FragmentBoardModifyBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView boardModifyImage, @NonNull EditText boardModifySubject,
      @NonNull EditText boardModifyText, @NonNull Toolbar boardModifyToolbar,
      @NonNull Spinner boardModifyType) {
    this.rootView = rootView;
    this.boardModifyImage = boardModifyImage;
    this.boardModifySubject = boardModifySubject;
    this.boardModifyText = boardModifyText;
    this.boardModifyToolbar = boardModifyToolbar;
    this.boardModifyType = boardModifyType;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBoardModifyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBoardModifyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_board_modify, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBoardModifyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.board_modify_image;
      ImageView boardModifyImage = ViewBindings.findChildViewById(rootView, id);
      if (boardModifyImage == null) {
        break missingId;
      }

      id = R.id.board_modify_subject;
      EditText boardModifySubject = ViewBindings.findChildViewById(rootView, id);
      if (boardModifySubject == null) {
        break missingId;
      }

      id = R.id.board_modify_text;
      EditText boardModifyText = ViewBindings.findChildViewById(rootView, id);
      if (boardModifyText == null) {
        break missingId;
      }

      id = R.id.board_modify_toolbar;
      Toolbar boardModifyToolbar = ViewBindings.findChildViewById(rootView, id);
      if (boardModifyToolbar == null) {
        break missingId;
      }

      id = R.id.board_modify_type;
      Spinner boardModifyType = ViewBindings.findChildViewById(rootView, id);
      if (boardModifyType == null) {
        break missingId;
      }

      return new FragmentBoardModifyBinding((LinearLayout) rootView, boardModifyImage,
          boardModifySubject, boardModifyText, boardModifyToolbar, boardModifyType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
