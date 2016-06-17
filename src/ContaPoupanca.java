/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOTFELIPE
 */
public class ContaPoupanca implements IConta {
    
    private double saldo;
    private double valorDeposito;
    private double valorSaque;
    
    
    @Override
    public void efetuarSaque(Double valorSaque) {
        this.saldo = saldo - valorSaque;
    }
    
    @Override
    public double obterSaldo() {
        return this.saldo;
    }

    @Override
    public void efetuarDeposito(Double valorDeposito) {
        this.saldo = saldo + valorDeposito;
        
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public double getValorSaque() {
        return valorSaque;
    }
}
