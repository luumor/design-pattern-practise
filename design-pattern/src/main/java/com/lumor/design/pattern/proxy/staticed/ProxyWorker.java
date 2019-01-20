package  com.lumor.design.pattern.proxy.staticed;
/**
 * @Auther: Administrator
 * @Date: 2019/1/3 0003 07:26
 * @Description:
 */
public class ProxyWorker {

    private Person person;

    ProxyWorker(Person person){
        this.person = person;
    }

    public void findJob() {
        person.findJob();
    }
}
