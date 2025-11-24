package service;

public class CanadaInterestService implements InterestService{

    private Double interestRate;

    public CanadaInterestService(Double interesrtRate) {
        this.interestRate = interesrtRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
