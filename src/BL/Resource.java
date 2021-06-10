package BL;

public class Resource {

    private int health_pool;
    private int health_amount;

    public Resource(int healthPool, int healthAmount) {
        this.health_amount = healthAmount;
        this.health_pool = healthPool;
    }

    public int getHealthAmount() {
        return health_amount;
    }

    public int getHealthPool() {
        return health_pool;
    }

    public void setHealthPool(int healthPool) {
        this.health_pool = healthPool;
    }
    public void setHealthAmount(int healthAmount) {
        this.health_amount = healthAmount;
    }



}
