using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PersonProgram
{
    class Contact
    {
        private string name,job,phone,tel,mail;
        private int age;

        public Contact(string name,int age,string job,string phone, string tel, string mail)//생성자
        {
            this.name = name;
            this.age = age;
            this.job = job;
            this.phone = phone;
            this.tel = tel;
            this.mail = mail;
        }

        public override string ToString()
        {
            return "이름 : " + this.name + ", 나이 : " + this.age + ", 직업 : " + this.job + 
                ", 핸드폰 : " + this.phone + ", 전화 : " + this.tel + ", 메일 : " + this.mail;
        }

    }
}
