package com.spenmo.pojos.response;

public class XeroCounts {
    public int total_with_sync_status;
    public int queuedForReconciliation;
    public int reconciled;
    public int failedReconciliation;


    public int getTotal_with_sync_status() {
        return total_with_sync_status;
    }

    public void setTotal_with_sync_status(int total_with_sync_status) {
        this.total_with_sync_status = total_with_sync_status;
    }

    public int getQueuedForReconciliation() {
        return queuedForReconciliation;
    }

    public void setQueuedForReconciliation(int queuedForReconciliation) {
        this.queuedForReconciliation = queuedForReconciliation;
    }

    public int getReconciled() {
        return reconciled;
    }

    public void setReconciled(int reconciled) {
        this.reconciled = reconciled;
    }

    public int getFailedReconciliation() {
        return failedReconciliation;
    }

    public void setFailedReconciliation(int failedReconciliation) {
        this.failedReconciliation = failedReconciliation;
    }
}
