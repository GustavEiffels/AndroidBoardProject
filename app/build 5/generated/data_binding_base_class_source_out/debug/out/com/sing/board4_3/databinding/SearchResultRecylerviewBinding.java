// Generated by view binder compiler. Do not edit!
package com.sing.board4_3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sing.board4_3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SearchResultRecylerviewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView searchResultNickname;

  @NonNull
  public final TextView searchResultSubject;

  @NonNull
  public final TextView searchResultWriteDate;

  private SearchResultRecylerviewBinding(@NonNull LinearLayout rootView,
      @NonNull TextView searchResultNickname, @NonNull TextView searchResultSubject,
      @NonNull TextView searchResultWriteDate) {
    this.rootView = rootView;
    this.searchResultNickname = searchResultNickname;
    this.searchResultSubject = searchResultSubject;
    this.searchResultWriteDate = searchResultWriteDate;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SearchResultRecylerviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SearchResultRecylerviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.search_result_recylerview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SearchResultRecylerviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.search_result_nickname;
      TextView searchResultNickname = ViewBindings.findChildViewById(rootView, id);
      if (searchResultNickname == null) {
        break missingId;
      }

      id = R.id.search_result_subject;
      TextView searchResultSubject = ViewBindings.findChildViewById(rootView, id);
      if (searchResultSubject == null) {
        break missingId;
      }

      id = R.id.search_result_write_date;
      TextView searchResultWriteDate = ViewBindings.findChildViewById(rootView, id);
      if (searchResultWriteDate == null) {
        break missingId;
      }

      return new SearchResultRecylerviewBinding((LinearLayout) rootView, searchResultNickname,
          searchResultSubject, searchResultWriteDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}