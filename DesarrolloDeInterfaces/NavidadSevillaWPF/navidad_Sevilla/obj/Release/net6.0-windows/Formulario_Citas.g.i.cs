﻿#pragma checksum "..\..\..\Formulario_Citas.xaml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "B2053BE315F0CFF86E62F5C3A1D4B17F6702F510"
//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Controls.Ribbon;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;
using navidadSevilla;


namespace navidadSevilla {
    
    
    /// <summary>
    /// Formulario_Citas
    /// </summary>
    public partial class Formulario_Citas : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 21 "..\..\..\Formulario_Citas.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox boxNombre;
        
        #line default
        #line hidden
        
        
        #line 22 "..\..\..\Formulario_Citas.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox boxApellidos;
        
        #line default
        #line hidden
        
        
        #line 23 "..\..\..\Formulario_Citas.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.ComboBox comboGrupo;
        
        #line default
        #line hidden
        
        
        #line 27 "..\..\..\Formulario_Citas.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.DatePicker pickerFecha;
        
        #line default
        #line hidden
        
        
        #line 28 "..\..\..\Formulario_Citas.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.ComboBox comboEspacio;
        
        #line default
        #line hidden
        
        
        #line 32 "..\..\..\Formulario_Citas.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.ComboBox comboTurno;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "7.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/navidad_Sevilla;component/formulario_citas.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\Formulario_Citas.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "7.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.boxNombre = ((System.Windows.Controls.TextBox)(target));
            return;
            case 2:
            this.boxApellidos = ((System.Windows.Controls.TextBox)(target));
            return;
            case 3:
            this.comboGrupo = ((System.Windows.Controls.ComboBox)(target));
            return;
            case 4:
            this.pickerFecha = ((System.Windows.Controls.DatePicker)(target));
            return;
            case 5:
            this.comboEspacio = ((System.Windows.Controls.ComboBox)(target));
            return;
            case 6:
            this.comboTurno = ((System.Windows.Controls.ComboBox)(target));
            return;
            case 7:
            
            #line 37 "..\..\..\Formulario_Citas.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.agregar);
            
            #line default
            #line hidden
            return;
            case 8:
            
            #line 38 "..\..\..\Formulario_Citas.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.cancelar);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

