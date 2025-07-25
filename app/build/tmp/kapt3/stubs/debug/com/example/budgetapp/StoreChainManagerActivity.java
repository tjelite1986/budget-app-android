package com.example.budgetapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/budgetapp/StoreChainManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "database", "Lcom/example/budgetapp/database/BudgetDatabase;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "storeChainAdapter", "Lcom/example/budgetapp/adapters/StoreChainAdapter;", "observeStoreChains", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFab", "setupRecyclerView", "setupViews", "showAddChainDialog", "showDeleteConfirmation", "chain", "Lcom/example/budgetapp/database/entities/StoreChain;", "showEditChainDialog", "toggleChainActive", "CashInCashOut_debug"})
public final class StoreChainManagerActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.budgetapp.database.BudgetDatabase database;
    private com.example.budgetapp.adapters.StoreChainAdapter storeChainAdapter;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    
    public StoreChainManagerActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupFab() {
    }
    
    private final void observeStoreChains() {
    }
    
    private final void showAddChainDialog() {
    }
    
    private final void showEditChainDialog(com.example.budgetapp.database.entities.StoreChain chain) {
    }
    
    private final void showDeleteConfirmation(com.example.budgetapp.database.entities.StoreChain chain) {
    }
    
    private final void toggleChainActive(com.example.budgetapp.database.entities.StoreChain chain) {
    }
}