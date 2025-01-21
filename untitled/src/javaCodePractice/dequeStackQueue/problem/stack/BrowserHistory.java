package javaCodePractice.dequeStackQueue.problem.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> browserHistory = new ArrayDeque<>();
    String currentBrowser = null;
    public void visitPage(String url) {
        if (currentBrowser != null) {
            browserHistory.push(currentBrowser);
        }
        currentBrowser = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!browserHistory.isEmpty()) {
            currentBrowser =  browserHistory.pop();
            System.out.println("뒤로 가기 목적지는: " + currentBrowser);
            return currentBrowser;
        }
        return null;
    }
}
