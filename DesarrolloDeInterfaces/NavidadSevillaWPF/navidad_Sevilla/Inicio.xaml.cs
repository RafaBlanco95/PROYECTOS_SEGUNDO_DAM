using navidadSevilla;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace navidad_Sevilla
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class Inicio : Window
    {
        public Inicio()
        {
            InitializeComponent();
        }

        private void gestionReservas(object sender, RoutedEventArgs e)
        {
            new Citas().Show();
        }

        private void espaciosActividades(object sender, RoutedEventArgs e)
        {
            new EspacioActividades().Show();
        }

        
    }
}
