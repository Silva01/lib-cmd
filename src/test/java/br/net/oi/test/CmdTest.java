package br.net.oi.test;

import br.net.oi.cmd.Cmd;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DanielSilva on 19/11/18.
 */
public class CmdTest {

    @Test
    public void deveraRealizarOPing() {
        try {
            Process processo = Runtime.getRuntime().exec("ping -c 127.0.0.1");
            String ping = IOUtils.toString(processo.getInputStream(), "UTF-8");

            Assert.assertEquals(ping, Cmd.exec("ping -c 127.0.0.1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(true, false);
        }
    }

    @Test
    public void deveraRealizarOTracert() {
        try {
            Process processo = Runtime.getRuntime().exec("nslookup 127.0.0.1");
            String ping = IOUtils.toString(processo.getInputStream(), "UTF-8");

            Assert.assertEquals(ping, Cmd.exec("nslookup 127.0.0.1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(true, false);
        }
    }

    @Test
    public void deveraRetornaroSO() {
        String so = System.getProperty("os.name").toLowerCase();
        Assert.assertEquals(so, Cmd.os());
    }

    @Test
    public void deveraPingar() {
        try {
            Process processo = Runtime.getRuntime().exec("ping -c 127.0.0.1");
            String ping = IOUtils.toString(processo.getInputStream(), "UTF-8");

            Assert.assertEquals(ping, Cmd.ping("127.0.0.1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(true, false);
        }
    }

    @Test
    public void deveraUsarTracert() {
        try {
            Process processo = Runtime.getRuntime().exec("nslookup 127.0.0.1");
            String ping = IOUtils.toString(processo.getInputStream(), "UTF-8");

            Assert.assertEquals(ping, Cmd.tracert("127.0.0.1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(true, false);
        }
    }
}
