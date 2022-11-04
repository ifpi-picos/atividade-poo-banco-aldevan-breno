

public  class  MenuBanco {
    public  static  void  main ( String [] args ) {
        int  controle = 0 ;
        Banco  b1 = novo  Banco ();
        while ( controle == 0 ){
             Leitor de scanner = novo  Scanner ( System . in );
        
            Sistema . fora . println ( "----------Menu----------" );
            Sistema . fora . println ( "1. Criar Conta" );
            Sistema . fora . println ( "2. Selecionar Conta" );
            Sistema . fora . println ( "3. Remover Conta" );
            Sistema . fora . println ( "4. Gerar Relatório" );
            Sistema . fora . println ( "5. Finalizar" );
            Sistema . fora . println ( "------------------------" );
            Sistema . fora . print ( "Opção: " );
            int  resposta = leitor . nextInt ();
            Sistema . fora . println ( "------------------------" );
        
            mudar ( resposta ){
                caso  1 :
                    Sistema . fora . println ( "1. Conta Corrente" );
                    Sistema . fora . println ( "2. Conta Poupança" );
                    Sistema . fora . println ( "------------------------" );
                    Sistema . fora . print ( "Opção: " );
                    int  resposta2 = leitor . nextInt ();
                    if ( resposta2 == 1 ){
                        ContaCorrente  cc = new  ContaCorrente ();
                        Sistema . fora . println ( "------------------------" );
                        Sistema . fora . println ( "Conta Corrente" );
                        Sistema . fora . print ( "Número da Conta: " );
                        cc . setNumConta ( leitor . nextInt ());
                        Sistema . fora . print ( "Saldo: " );
                        cc . setSaldo ( leitor . nextDouble ());
                        Sistema . fora . print ( "Taxa de Operação: " );
                        cc . setTaxaOp ( leitor . nextDouble ());
                        Sistema . fora . println ( "------------------------" );
                        b1 . inserirConta ( cc );
                        Sistema . fora . println ( "------------------------" );
                        cc . mostrarDados ();
                        Sistema . fora . println ( "------------------------" );
                        quebrar ;
                    }
                    if ( resposta2 == 2 ){
                        ContaPoupanca  cp = new  ContaPoupanca ();
                        Sistema . fora . println ( "------------------------" );
                        Sistema . fora . println ( "Conta Poupança" );
                        Sistema . fora . print ( "Número da Conta: " );
                        cp . setNumConta ( leitor . nextInt ());
                        Sistema . fora . print ( "Saldo: " );
                        cp . setSaldo ( leitor . nextDouble ());
                        Sistema . fora . print ( "Limite: " );
                        cp . setLimite ( leitor . nextDouble ());
                        Sistema . fora . println ( "------------------------" );
                        b1 . inserirConta ( cp );
                        Sistema . fora . println ( "------------------------" );
                        cp . mostrarDados ();
                        Sistema . fora . println ( "------------------------" );
                        quebrar ;
                    }
                caso  2 :
                    Sistema . fora . println ( "------------------------" );
                    Sistema . fora . println ( "Selecionar Conta" );
                    Sistema . fora . print ( "Informe o numero da conta: " );
                    int  resposta3 = leitor . nextInt ();
                    Sistema . fora . println ( "------------------------" );
                    Sistema . fora . print ( "Conta Selecionada: " );
                    ContaBancaria  contaSelecionada = b1 . procurarConta ( resposta3 );
                    Sistema . fora . println ( "------------------------" );
                    
                    if ( contaSelecionada != null ){
                        Scanner  sc = new  Scanner ( System . in );
                        Sistema . fora . println ( "------------------------" );
                        Sistema . fora . println ( "1. Depositante" );
                        Sistema . fora . println ( "2. Sacar" );
                        Sistema . fora . println ( "3. Transferir" );
                        Sistema . fora . println ( "4. Gerar Relatório" );
                        Sistema . fora . println ( "5. Retornar ao menu anterior" );
                        Sistema . fora . println ( "------------------------" );
                        Sistema . fora . print ( "Opção: " );
                        int  resp = sc . nextInt ();
                        interruptor ( resp ) {
                            caso  1 :
                                Sistema . fora . println ( "------------------------" );
                                Sistema . fora . println ( "Depositário" );
                                Sistema . fora . print ( "Valor: " );
                                double  saldoAnterior = contaSelecionada . getSaldo ();
                                double  valorDeposito = sc . próximoDouble ();
                                double  saldoComDeposito = contaSelecionada . depositar ( valorDeposito );
                                Sistema . fora . println ( "------------------------" );
                                Sistema . fora . println ( "Saldo Anterior: " + saldoAnterior );
                                Sistema . fora . println ( "Valor Depósito: " + valorDepósito );
                                Sistema . fora . println ( "Saldo com Depósito: " + contaSelecionada . getSaldo ());
                                Sistema . fora . println ( "------------------------" );
                                quebrar ;
                            caso  2 :
                                Sistema . fora . println ( "------------------------" );
                                Sistema . fora . println ( "Sacar" );
                                Sistema . fora . print ( "Valor: " );
                                double  saldoAntecedente = contaSelecionada . getSaldo ();
                                double  valorSaque = sc . próximoDouble ();
                                double  saldoComSaque = contaSelecionada . sacar ( valorSaque );
                                Sistema . fora . println ( "------------------------" );
                                Sistema . fora . println ( "Saldo Anterior: " + saldoAntecedente );
                                Sistema . fora . println ( "Valor Saque:" + valorSaque );
                                Sistema . fora . println saque ( "Saldo após: " + contaSelecionada . getSaldo ());
                                Sistema . fora . println ( "------------------------" );
                                quebrar ;
                            caso  3 :
                                Sistema . fora . println ( "------------------------" );
                                Sistema . fora . println ( "Transferir" );
                                Sistema . fora . print ( "Conta Destino: " );
                                int  resp4 = sc . nextInt ();
                                ContaBancaria  contaDestino = b1 . procurarConta ( resp4 );
                                if ( contaDestino != null ) {
                                    Sistema . fora . print ( "Valor: " );
                                    double  valorTransf = sc . próximoDouble ();
                                    double  saldoOrigem = contaSelecionada . getSaldo ();
                                    double  saldoDestino = contaDestino . getSaldo ();
                                    contaSelecionada . transferir ( valorTransf , contaDestino );
                                    Sistema . fora . println ( "------------------------" );
                                    Sistema . fora . println ( "Conta Origem: " + contaSelecionada . getNumConta ());
                                    Sistema . fora . println ( "Saldo Anteiror: " + saldoOrigem );
                                    Sistema . fora . println ( "Saldo Atual: " + contaSelecionada . getSaldo ());
                                    Sistema . fora . println ( "------------------------" );
                                    Sistema . fora . println ( "Conta Destino: " + contaDestino . getNumConta ());
                                    Sistema . fora . println ( "Saldo Anterior: " + saldoDestino );
                                    Sistema . fora . println ( "Saldo Atual: " + contaDestino . getSaldo ());
                                } senão {
                                    Sistema . fora . println ( "Operação Abortada!" );
                               }
                                Sistema . fora . println ( "------------------------" );
                                quebrar ;
                            caso  4 :
                                Sistema . fora . println ( "------------------------" );
                                Sistema . fora . println ( "Gerar Relatório" );
                                 Relatório relatorio = new Relatório  ( );
                                relatorio . gerarRelatorio ( contaSelecionada );
                                Sistema . fora . println ( "------------------------" );
                                quebrar ;
                            caso  5 :
                                Sistema . fora . println ( "------------------------" );
                                Sistema . fora . println ( "Retornar ao menu anterior" );
                                Sistema . fora . println ( "------------------------" );
                                quebrar ;
                            padrão :
                                Sistema . fora . println ( "Opção Inválida!" );
                        }
                    }
                    quebrar ;
                    
                caso  3 :
                    Sistema . fora . println ( "------------------------" );
                    Sistema . fora . println ( "Remover Conta" );
                    Sistema . fora . print ( "Informe o numero da conta: " );
                    int  resposta4 = leitor . nextInt ();
                    Sistema . fora . println ( "------------------------" );
                    b1 . removedorConta ( resposta4 );
                    Sistema . fora . println ( "------------------------" );
                    quebrar ;
                caso  4 :
                    Sistema . fora . println ( "------------------------" );
                    Sistema . fora . println ( "Gerar Relatório" );
                    b1 . mostrarDados ();
                    Sistema . fora . println ( "------------------------" );
                    quebrar ;
                caso  5 :
                    Sistema . fora . println ( "------------------------" );
                    Sistema . fora . println ( "Operação Finalização!" );
                    Sistema . fora . println ( "------------------------" );
                    controle = 1 ;
                    quebrar ;
                padrão :
                    Sistema . fora . println ( "Opção Inválida!" );
            }
        }
    }
}