package org.robovm.pods.billing;

import org.robovm.pods.Platform;
import org.robovm.pods.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Store {
    void setup(StoreSetupListener listener);

    boolean isAvailable();

    ProductCatalog getProductCatalog();

    void requestProductData();

    void restoreTransactions();

    void purchaseProduct(Product product);

    void dispose();

    StoreType getType();

    final class Builder {
        ProductCatalog productCatalog;
        List<BillingObserver> billingObservers = new ArrayList<>();
        boolean autoFinishTransactions;
        TransactionVerificator verificator;
        boolean autoVerifyTransactions;
        Map<StoreType, String> storeKeys = new HashMap<>();

        public Builder setProductCatalog(ProductCatalog catalog) {
            this.productCatalog = catalog;
            return this;
        }

        public Builder addStoreKey(StoreType store, String key) {
            storeKeys.put(store, key);
            return this;
        }

        public Builder setAutoFinishTransactions(boolean autoFinishTransactions) {
            this.autoFinishTransactions = autoFinishTransactions;
            return this;
        }

        public Builder setTransactionVerificator(TransactionVerificator verificator) {
            return setTransactionVerificator(verificator, false);
        }

        public Builder setTransactionVerificator(TransactionVerificator verificator, boolean autoVerifyTransactions) {
            Util.requireNonNull(verificator, "verificator");
            this.verificator = verificator;
            this.autoVerifyTransactions = autoVerifyTransactions;
            return this;
        }

        public Builder addBillingObserver(BillingObserver observer) {
            this.billingObservers.add(observer);
            return this;
        }

        public Store build() {
            if (productCatalog == null) {
                throw new UnsupportedOperationException("Need to set a product catalog!");
            }
            if (billingObservers.size() == 0) {
                throw new UnsupportedOperationException("Need to add at least one billing observer!");
            }
            Store store = Platform.getPlatform().getInstance(Store.class, this);
            if (verificator != null) {
                verificator.setStore(store);
            }
            return store;
        }
    }
}
