// Generated by view binder compiler. Do not edit!
package com.example.budgetapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.budgetapp.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogInsightDetailsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton buttonClose;

  @NonNull
  public final MaterialButton buttonMarkAsRead;

  @NonNull
  public final MaterialButton buttonTakeAction;

  @NonNull
  public final ImageView imageViewInsightType;

  @NonNull
  public final LinearLayout layoutAdditionalData;

  @NonNull
  public final LinearLayout layoutAmountInfo;

  @NonNull
  public final LinearLayout layoutCategory;

  @NonNull
  public final LinearLayout layoutSuggestedAction;

  @NonNull
  public final ProgressBar progressBarConfidence;

  @NonNull
  public final TextView textViewAdditionalData;

  @NonNull
  public final TextView textViewAmount;

  @NonNull
  public final TextView textViewCategory;

  @NonNull
  public final TextView textViewConfidence;

  @NonNull
  public final TextView textViewDate;

  @NonNull
  public final TextView textViewDescription;

  @NonNull
  public final TextView textViewInsightType;

  @NonNull
  public final TextView textViewPercentage;

  @NonNull
  public final TextView textViewSeverity;

  @NonNull
  public final TextView textViewSuggestedAction;

  @NonNull
  public final TextView textViewTitle;

  private DialogInsightDetailsBinding(@NonNull ScrollView rootView,
      @NonNull MaterialButton buttonClose, @NonNull MaterialButton buttonMarkAsRead,
      @NonNull MaterialButton buttonTakeAction, @NonNull ImageView imageViewInsightType,
      @NonNull LinearLayout layoutAdditionalData, @NonNull LinearLayout layoutAmountInfo,
      @NonNull LinearLayout layoutCategory, @NonNull LinearLayout layoutSuggestedAction,
      @NonNull ProgressBar progressBarConfidence, @NonNull TextView textViewAdditionalData,
      @NonNull TextView textViewAmount, @NonNull TextView textViewCategory,
      @NonNull TextView textViewConfidence, @NonNull TextView textViewDate,
      @NonNull TextView textViewDescription, @NonNull TextView textViewInsightType,
      @NonNull TextView textViewPercentage, @NonNull TextView textViewSeverity,
      @NonNull TextView textViewSuggestedAction, @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.buttonClose = buttonClose;
    this.buttonMarkAsRead = buttonMarkAsRead;
    this.buttonTakeAction = buttonTakeAction;
    this.imageViewInsightType = imageViewInsightType;
    this.layoutAdditionalData = layoutAdditionalData;
    this.layoutAmountInfo = layoutAmountInfo;
    this.layoutCategory = layoutCategory;
    this.layoutSuggestedAction = layoutSuggestedAction;
    this.progressBarConfidence = progressBarConfidence;
    this.textViewAdditionalData = textViewAdditionalData;
    this.textViewAmount = textViewAmount;
    this.textViewCategory = textViewCategory;
    this.textViewConfidence = textViewConfidence;
    this.textViewDate = textViewDate;
    this.textViewDescription = textViewDescription;
    this.textViewInsightType = textViewInsightType;
    this.textViewPercentage = textViewPercentage;
    this.textViewSeverity = textViewSeverity;
    this.textViewSuggestedAction = textViewSuggestedAction;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogInsightDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogInsightDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_insight_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogInsightDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonClose;
      MaterialButton buttonClose = ViewBindings.findChildViewById(rootView, id);
      if (buttonClose == null) {
        break missingId;
      }

      id = R.id.buttonMarkAsRead;
      MaterialButton buttonMarkAsRead = ViewBindings.findChildViewById(rootView, id);
      if (buttonMarkAsRead == null) {
        break missingId;
      }

      id = R.id.buttonTakeAction;
      MaterialButton buttonTakeAction = ViewBindings.findChildViewById(rootView, id);
      if (buttonTakeAction == null) {
        break missingId;
      }

      id = R.id.imageViewInsightType;
      ImageView imageViewInsightType = ViewBindings.findChildViewById(rootView, id);
      if (imageViewInsightType == null) {
        break missingId;
      }

      id = R.id.layoutAdditionalData;
      LinearLayout layoutAdditionalData = ViewBindings.findChildViewById(rootView, id);
      if (layoutAdditionalData == null) {
        break missingId;
      }

      id = R.id.layoutAmountInfo;
      LinearLayout layoutAmountInfo = ViewBindings.findChildViewById(rootView, id);
      if (layoutAmountInfo == null) {
        break missingId;
      }

      id = R.id.layoutCategory;
      LinearLayout layoutCategory = ViewBindings.findChildViewById(rootView, id);
      if (layoutCategory == null) {
        break missingId;
      }

      id = R.id.layoutSuggestedAction;
      LinearLayout layoutSuggestedAction = ViewBindings.findChildViewById(rootView, id);
      if (layoutSuggestedAction == null) {
        break missingId;
      }

      id = R.id.progressBarConfidence;
      ProgressBar progressBarConfidence = ViewBindings.findChildViewById(rootView, id);
      if (progressBarConfidence == null) {
        break missingId;
      }

      id = R.id.textViewAdditionalData;
      TextView textViewAdditionalData = ViewBindings.findChildViewById(rootView, id);
      if (textViewAdditionalData == null) {
        break missingId;
      }

      id = R.id.textViewAmount;
      TextView textViewAmount = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmount == null) {
        break missingId;
      }

      id = R.id.textViewCategory;
      TextView textViewCategory = ViewBindings.findChildViewById(rootView, id);
      if (textViewCategory == null) {
        break missingId;
      }

      id = R.id.textViewConfidence;
      TextView textViewConfidence = ViewBindings.findChildViewById(rootView, id);
      if (textViewConfidence == null) {
        break missingId;
      }

      id = R.id.textViewDate;
      TextView textViewDate = ViewBindings.findChildViewById(rootView, id);
      if (textViewDate == null) {
        break missingId;
      }

      id = R.id.textViewDescription;
      TextView textViewDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewDescription == null) {
        break missingId;
      }

      id = R.id.textViewInsightType;
      TextView textViewInsightType = ViewBindings.findChildViewById(rootView, id);
      if (textViewInsightType == null) {
        break missingId;
      }

      id = R.id.textViewPercentage;
      TextView textViewPercentage = ViewBindings.findChildViewById(rootView, id);
      if (textViewPercentage == null) {
        break missingId;
      }

      id = R.id.textViewSeverity;
      TextView textViewSeverity = ViewBindings.findChildViewById(rootView, id);
      if (textViewSeverity == null) {
        break missingId;
      }

      id = R.id.textViewSuggestedAction;
      TextView textViewSuggestedAction = ViewBindings.findChildViewById(rootView, id);
      if (textViewSuggestedAction == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new DialogInsightDetailsBinding((ScrollView) rootView, buttonClose, buttonMarkAsRead,
          buttonTakeAction, imageViewInsightType, layoutAdditionalData, layoutAmountInfo,
          layoutCategory, layoutSuggestedAction, progressBarConfidence, textViewAdditionalData,
          textViewAmount, textViewCategory, textViewConfidence, textViewDate, textViewDescription,
          textViewInsightType, textViewPercentage, textViewSeverity, textViewSuggestedAction,
          textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
