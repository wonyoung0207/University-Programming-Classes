using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp
{
    public class Info//생략하면 private 임 -> public 으로 해줘야 프로퍼티 이용할 수 있다. 
    {
        String name, gender, favorite = "";
        int age, year, month, day;

        public Info(String name, int age, String gender, int year, int month, int day, String favorite)
        {//생성자
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.year = year;
            this.month = month;
            this.day = day;
            this.favorite = favorite;

        }

        public String Name
        {
            get{ return name; }
            set { this.name = value; }
        }

        public int Age
        {
            get { return age; }
            set { this.age = value; }
        }

        public String Gender
        {
            get { return gender; }
            set { this.gender = value; }
        }

        public int Year
        {
            get { return year; }
            set { this.year = value; }
        }

        public int Month
        {
            get { return month; }
            set { this.month = value; }
        }

        public int Day
        {
            get { return day; }
            set { this.day = value; }
        }

        public String Favorite
        {
            get { return favorite; }
            set { this.favorite = value; }
        }

    }
}
