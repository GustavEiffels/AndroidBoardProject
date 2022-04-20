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

public final class FragmentNickBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button nickJoin;

  @NonNull
  public final EditText nickNickname;

  @NonNull
  public final Toolbar toolbar;

  private FragmentNickBinding(@NonNull LinearLayout rootView, @NonNull Button nickJoin,
      @NonNull EditText nickNickname, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.nickJoin = nickJoin;
    this.nickNickname = nickNickname;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNickBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNickBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_nick, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNickBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.nick_join;
      Button nickJoin = ViewBindings.findChildViewById(rootView, id);
      if (nickJoin == null) {
        break missingId;
      }

      id = R.id.nick_nickname;
      EditText nickNickname = ViewBindings.findChildViewById(rootView, id);
      if (nickNickname == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentNickBinding((LinearLayout) rootView, nickJoin, nickNickname, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}