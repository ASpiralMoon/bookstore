package org.bookstore.dto;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/4 13:53
 * @modify ...
 */
public class User {

    private int userId;

    private String username;

    private String password;

    private byte role;

    private String nickname;

    private byte loginFailed;

    private String bankCard;

    private String paymentPassword;

    private String name;

    private String email;

    private String passwordQuestion;

    private String answer;

    private byte status;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", nickname='" + nickname + '\'' +
                ", loginFailed=" + loginFailed +
                ", bankCard='" + bankCard + '\'' +
                ", paymentPassword='" + paymentPassword + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", passwordQuestion='" + passwordQuestion + '\'' +
                ", answer='" + answer + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getRole() {
        return role;
    }

    public void setRole(byte role) {
        this.role = role;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte getLoginFailed() {
        return loginFailed;
    }

    public void setLoginFailed(byte loginFailed) {
        this.loginFailed = loginFailed;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getPaymentPassword() {
        return paymentPassword;
    }

    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    public void setPasswordQuestion(String passwordQuestion) {
        this.passwordQuestion = passwordQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
