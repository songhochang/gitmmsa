using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Random rd = new Random();
            int num1 = rd.Next(47);
            int num2 = rd.Next(47);
            int num3 = rd.Next(47);
            int num4 = rd.Next(47);
            int num5 = rd.Next(47);
            int num6 = rd.Next(47);
            Console.WriteLine("num1 = " + num1);
            label1.Text = num1.ToString();
            label1.AutoSize = false;
            label2.Text = num2.ToString();
            label2.AutoSize = false;
            label3.Text = num3.ToString();
            label3.AutoSize = false;
            label4.Text = num4.ToString();
            label4.AutoSize = false;
            label5.Text = num5.ToString();
            label5.AutoSize = false;
            label6.Text = num6.ToString();
            label6.AutoSize = false;
        }
    }
}
