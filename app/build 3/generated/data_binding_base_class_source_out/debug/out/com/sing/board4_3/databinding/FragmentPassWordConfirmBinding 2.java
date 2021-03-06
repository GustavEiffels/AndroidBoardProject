// Generated by view binder compiler. Do not edit!
package com.sing.board4_3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sing.board4_3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPassWordConfirmBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText PasswordConfirmPassword;

  @NonNull
  public final Toolbar PasswordConfirmToolbar;

  @NonNull
  public final Button passwordConfirmBtn;

  private FragmentPassWordConfirmBinding(@NonNull LinearLayout rootView,
      @NonNull EditText PasswordConfirmPassword, @NonNull Toolbar PasswordConfirmToolbar,
      @NonNull Button passwordConfirmBtn) {
    this.rootView = rootView;
    this.PasswordConfirmPassword = PasswordConfirmPassword;
    this.PasswordConfirmToolbar = PasswordConfirmToolbar;
    this.passwordConfirmBtn = passwordConfirmBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPassWordConfirmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPassWordConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_pass_word_confirm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPassWordConfirmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Password_confirm_password;
      EditText PasswordConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (PasswordConfirmPassword == null) {
        break missingId;
      }

      id = R.id.Password_confirm_toolbar;
      Toolbar PasswordConfirmToolbar = ViewBindings.findChildViewById(rootView, id);
      if (PasswordConfirmToolbar == null) {
        break missingId;
      }

      id = R.id.password_confirm_btn;
      Button passwordConfirmBtn = ViewBindings.findChildViewById(rootView, id);
      if (passwordConfirmBtn == null) {
        break missingId;
      }

      return new FragmentPassWordConfirmBinding((LinearLayout) rootView, PasswordConfirmPassword,
          PasswordConfirmToolbar, passwordConfirmBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
