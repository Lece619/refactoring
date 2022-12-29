package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    //값을 리턴하는 함수 지만 조회하는 함수로 확인이 되기도 한다.
    public double getProduction() {
        return this.adjustments.stream().mapToDouble(Double::valueOf).sum();
    }

}
