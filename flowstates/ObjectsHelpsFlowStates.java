package com.kjh.book.springboot.flowstates;

public class ObjectsHelpsFlowStates {
    boolean flowStates;
    SwitchingCosts switchingCosts = new SwitchingCosts();
    void distractionFree(){

        // choose focus, ignore distraction
        // focus starting with distraction together
        // switching costs
        if (flowStates == true){
            if (switchingCosts == null) {
                // keep flow states
            }else {
                for (int i = 0; i >= 0 ;i ++){
                    Integer switchingCostsIntegerType = new Integer(String.valueOf(switchingCosts));
                    switchingCostsIntegerType = i;
                }
            }
        }
    }

    void controlMind(){
        // control inside mind
        String brain = "Some stresses and some unnecessary things";
        while(flowStates == true && switchingCosts == null){
            brain.replace("stress"," "); // clear own brain
        }
        /**
         * - 정기적인 휴식 (피곤 == 산만함)
         * - 자극 최소화(sns, email, smartphone..)
         * - 작업시 메모 습관(_내면은 아이디어를 기억하는 곳이 아닌 생성자여야 한다_)
         * - 카페인, 설탕 섭취 제한
         * - 명상 습관 (정신적 활동, 뇌 피질 두께 증가 연관 입증 연구)
         * - 매일 아이디어, 또는 스트레스 기록하는 일지 작성 (종이에 붙이는 것은 정신이 멍해짐)
         */
    }

    void cognitiveOptimize(){
        // control difficulty most hard, but not defeat(brain optimizing works)
        // need enough water(reduce brain fog)
        // peek time (naturally most focused time)

        ControlDifficulty controlDifficulty = new ControlDifficulty();
        Water water = new Water();
        PeekTime peekTime = new PeekTime();

    }
}
