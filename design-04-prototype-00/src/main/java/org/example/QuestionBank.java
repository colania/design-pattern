package org.example;

import org.example.entity.AnswerQuestion;
import org.example.entity.ChoiceQuestion;
import org.example.flyweight.util.Topic;
import org.example.flyweight.util.TopicUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/24
 */
public class QuestionBank implements Cloneable {
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();
    private String candidate; // 考生
    private String number;    // 考号

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }


    @Override
    public QuestionBank clone() {
        try {
            QuestionBank clone = (QuestionBank) super.clone();
            clone.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
            clone.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
            //题目乱序
            Collections.shuffle(clone.choiceQuestionList);
            Collections.shuffle(clone.answerQuestionList);
            //答案乱序
            ArrayList<ChoiceQuestion> choiceQuestionList = clone.choiceQuestionList;
            for (ChoiceQuestion question : choiceQuestionList) {
                Topic topic = TopicUtil.random(question.getOption(), question.getKey());
                question.setOption(topic.getOption());
                question.setKey(topic.getKey());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    public ArrayList<ChoiceQuestion> getChoiceQuestionList() {
        return choiceQuestionList;
    }

    public void setChoiceQuestionList(ArrayList<ChoiceQuestion> choiceQuestionList) {
        this.choiceQuestionList = choiceQuestionList;
    }

    public ArrayList<AnswerQuestion> getAnswerQuestionList() {
        return answerQuestionList;
    }

    public void setAnswerQuestionList(ArrayList<AnswerQuestion> answerQuestionList) {
        this.answerQuestionList = answerQuestionList;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
                ;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }
}
