using navidadSevilla.dto;
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

namespace navidadSevilla
{
    /// <summary>
    /// Lógica de interacción para Page1.xaml
    /// </summary>
    public partial class Formulario_Citas : Window
    {
        public Cita cita;
        private int index;
        public int error;
        public Formulario_Citas()
        {
            InitializeComponent();
            this.index = -1;
            cita = new Cita();
            this.DataContext = cita;
        }

        public Formulario_Citas(String espacio)
        {
            InitializeComponent();
            this.index = -1;
            cita = new Cita();
            this.DataContext = cita;
            cita.Espacio= espacio;
        }

        public Formulario_Citas(int index)
        {
            InitializeComponent();
            this.index = index;
            cita = new Cita();
            this.DataContext = Citas.logica.listaCitas.ElementAt(index);
        }

        public void agregar(object sender, RoutedEventArgs e)
        {
            if (index > -1)
            {
                cita = new Cita(boxNombre.Text, boxApellidos.Text, comboGrupo.Text, (DateTime)pickerFecha.SelectedDate, comboTurno.Text, comboEspacio.Text, comboActividad.Text);
                Citas.logica.editarCita(index, cita);
                this.Close();
            }
            else
            {
                Citas.logica.agregarCita(cita);
                this.Close();
            }
           

        }
        private void cancelar(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void validation_error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
            {
                error++;
            }
            else
            {
                error--;
            }
            if (error == 0)
            {
                Aceptar.IsEnabled = true;
            }
            else
            {
                Aceptar.IsEnabled = false;
            }
        }
        public void goBack(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

    }
}

