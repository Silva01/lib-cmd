package br.net.oi.cmd;

import org.apache.commons.io.IOUtils;

/**
 * Created by DanielSilva on 19/11/18.
 */
public class Cmd {

    private static final String CODIFICACAO = "UTF-8";
    private static final String OS = "os.name";

    /**
     * Este método executa um comando qualquer iformado pelo usuário
     *
     * @param cmd Comando a ser executado
     * @return String de retorno do comando
     * @throws Exception Erro ao executar comando
     */
    public static String exec (final String cmd) throws Exception {
        try {
            return IOUtils.toString(Runtime.getRuntime().exec(cmd).getInputStream(), CODIFICACAO);
        } catch (Exception e) {
            throw new Exception("Erro ao executar comando", e);
        }
    }

    /**
     * Este método realiza o ping com base em um ip informado
     *
     * @param ip Ip a ser pingado na rede
     * @return String de ping
     * @throws Exception erro ao executar comando
     */
    public static String ping (final String ip) throws Exception {
        try {
            return IOUtils.toString(Runtime.getRuntime().exec("ping -c " + ip).getInputStream(), CODIFICACAO);
        } catch (Exception e) {
            throw new Exception("Erro ao executar comando", e);
        }
    }

    /**
     * Este método realiza o tracert para obter o hst do ip informado
     *
     * @param  ip Ip a ser pesquisado na rede
     * @return String com o Host e resultado do comando
     * @throws Exception erro ao executar comando
     */
    public static String tracert (final String ip) throws Exception {
        try {
            return IOUtils.toString(Runtime.getRuntime().exec("nslookup " + ip).getInputStream(), CODIFICACAO);
        } catch (Exception e) {
            throw new Exception("Erro ao executar comando", e);
        }
    }

    /**
     * Este metodo retorna em Qual sistema operacional
     * o java é executado
     * @return String com o nome do SO
     */
    public static String os () {
        return System.getProperty(OS).toLowerCase();
    }
}
