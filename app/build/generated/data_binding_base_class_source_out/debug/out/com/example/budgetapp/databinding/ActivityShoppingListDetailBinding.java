// Generated by view binder compiler. Do not edit!
package com.example.budgetapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.budgetapp.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShoppingListDetailBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final MaterialButton buttonAddFirstItem;

  @NonNull
  public final Chip chipStatus;

  @NonNull
  public final LinearLayout emptyStateLayout;

  @NonNull
  public final FloatingActionButton fabAddItem;

  @NonNull
  public final RecyclerView recyclerViewItems;

  @NonNull
  public final TextView textActualCost;

  @NonNull
  public final TextView textCompletedItems;

  @NonNull
  public final TextView textCreatedDate;

  @NonNull
  public final TextView textEstimatedCost;

  @NonNull
  public final TextView textListDescription;

  @NonNull
  public final TextView textTotalItems;

  @NonNull
  public final Toolbar toolbar;

  private ActivityShoppingListDetailBinding(@NonNull CoordinatorLayout rootView,
      @NonNull MaterialButton buttonAddFirstItem, @NonNull Chip chipStatus,
      @NonNull LinearLayout emptyStateLayout, @NonNull FloatingActionButton fabAddItem,
      @NonNull RecyclerView recyclerViewItems, @NonNull TextView textActualCost,
      @NonNull TextView textCompletedItems, @NonNull TextView textCreatedDate,
      @NonNull TextView textEstimatedCost, @NonNull TextView textListDescription,
      @NonNull TextView textTotalItems, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.buttonAddFirstItem = buttonAddFirstItem;
    this.chipStatus = chipStatus;
    this.emptyStateLayout = emptyStateLayout;
    this.fabAddItem = fabAddItem;
    this.recyclerViewItems = recyclerViewItems;
    this.textActualCost = textActualCost;
    this.textCompletedItems = textCompletedItems;
    this.textCreatedDate = textCreatedDate;
    this.textEstimatedCost = textEstimatedCost;
    this.textListDescription = textListDescription;
    this.textTotalItems = textTotalItems;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShoppingListDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShoppingListDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_shopping_list_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShoppingListDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_add_first_item;
      MaterialButton buttonAddFirstItem = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddFirstItem == null) {
        break missingId;
      }

      id = R.id.chip_status;
      Chip chipStatus = ViewBindings.findChildViewById(rootView, id);
      if (chipStatus == null) {
        break missingId;
      }

      id = R.id.empty_state_layout;
      LinearLayout emptyStateLayout = ViewBindings.findChildViewById(rootView, id);
      if (emptyStateLayout == null) {
        break missingId;
      }

      id = R.id.fab_add_item;
      FloatingActionButton fabAddItem = ViewBindings.findChildViewById(rootView, id);
      if (fabAddItem == null) {
        break missingId;
      }

      id = R.id.recycler_view_items;
      RecyclerView recyclerViewItems = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewItems == null) {
        break missingId;
      }

      id = R.id.text_actual_cost;
      TextView textActualCost = ViewBindings.findChildViewById(rootView, id);
      if (textActualCost == null) {
        break missingId;
      }

      id = R.id.text_completed_items;
      TextView textCompletedItems = ViewBindings.findChildViewById(rootView, id);
      if (textCompletedItems == null) {
        break missingId;
      }

      id = R.id.text_created_date;
      TextView textCreatedDate = ViewBindings.findChildViewById(rootView, id);
      if (textCreatedDate == null) {
        break missingId;
      }

      id = R.id.text_estimated_cost;
      TextView textEstimatedCost = ViewBindings.findChildViewById(rootView, id);
      if (textEstimatedCost == null) {
        break missingId;
      }

      id = R.id.text_list_description;
      TextView textListDescription = ViewBindings.findChildViewById(rootView, id);
      if (textListDescription == null) {
        break missingId;
      }

      id = R.id.text_total_items;
      TextView textTotalItems = ViewBindings.findChildViewById(rootView, id);
      if (textTotalItems == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityShoppingListDetailBinding((CoordinatorLayout) rootView, buttonAddFirstItem,
          chipStatus, emptyStateLayout, fabAddItem, recyclerViewItems, textActualCost,
          textCompletedItems, textCreatedDate, textEstimatedCost, textListDescription,
          textTotalItems, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
