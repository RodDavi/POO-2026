import React, { useState } from 'react';
import Login from './components/Login';
import Navbar from './components/Navbar';
import SecretaryDashboard from './components/secretary/SecretaryDashboard';
import Scheduling from './components/secretary/Scheduling';
import Registrations from './components/secretary/Registrations';
import VetDashboard from './components/vet/VetDashboard';
import Appointment from './components/vet/Appointment';
import AdminDashboard from './components/admin/AdminDashboard';
import Users from './components/admin/Users';
import Reports from './components/admin/Reports';
import HistoryPage from './components/HistoryPage';
import ErrorPage from './components/ErrorPage';
import { Toaster } from './components/ui/sonner';

export type UserRole = 'secretary' | 'vet' | 'admin';

export interface User {
  id: string;
  name: string;
  email: string;
  role: UserRole;
}

export default function App() {
  const [currentUser, setCurrentUser] = useState<User | null>(null);
  const [currentPage, setCurrentPage] = useState<string>('dashboard');
  const [selectedAppointment, setSelectedAppointment] = useState<any>(null);

  const handleLogin = (user: User) => {
    setCurrentUser(user);
    setCurrentPage('dashboard');
  };

  const handleLogout = () => {
    setCurrentUser(null);
    setCurrentPage('dashboard');
    setSelectedAppointment(null);
  };

  const handleNavigation = (page: string) => {
    setCurrentPage(page);
    setSelectedAppointment(null);
  };

  const handleStartAppointment = (appointment: any) => {
    setSelectedAppointment(appointment);
    setCurrentPage('appointment');
  };

  if (!currentUser) {
    return (
      <>
        <Login onLogin={handleLogin} />
        <Toaster />
      </>
    );
  }

  const renderContent = () => {
    // Secretary pages
    if (currentUser.role === 'secretary') {
      switch (currentPage) {
        case 'dashboard':
          return <SecretaryDashboard onNavigate={handleNavigation} />;
        case 'scheduling':
          return <Scheduling onBack={() => handleNavigation('dashboard')} />;
        case 'registrations':
          return <Registrations onBack={() => handleNavigation('dashboard')} />;
        case 'history':
          return <HistoryPage onBack={() => handleNavigation('dashboard')} />;
        default:
          return <SecretaryDashboard onNavigate={handleNavigation} />;
      }
    }

    // Vet pages
    if (currentUser.role === 'vet') {
      switch (currentPage) {
        case 'dashboard':
          return <VetDashboard onStartAppointment={handleStartAppointment} />;
        case 'appointment':
          return <Appointment appointment={selectedAppointment} onBack={() => handleNavigation('dashboard')} />;
        case 'history':
          return <HistoryPage onBack={() => handleNavigation('dashboard')} />;
        default:
          return <VetDashboard onStartAppointment={handleStartAppointment} />;
      }
    }

    // Admin pages
    if (currentUser.role === 'admin') {
      switch (currentPage) {
        case 'dashboard':
          return <AdminDashboard onNavigate={handleNavigation} />;
        case 'users':
          return <Users onBack={() => handleNavigation('dashboard')} />;
        case 'reports':
          return <Reports onBack={() => handleNavigation('dashboard')} />;
        case 'history':
          return <HistoryPage onBack={() => handleNavigation('dashboard')} />;
        default:
          return <AdminDashboard onNavigate={handleNavigation} />;
      }
    }

    return <ErrorPage type="404" />;
  };

  return (
    <div className="min-h-screen bg-[#F9FAFB]">
      <Navbar 
        user={currentUser} 
        onNavigate={handleNavigation} 
        onLogout={handleLogout}
        currentPage={currentPage}
      />
      <main className="pt-20">
        {renderContent()}
      </main>
      <Toaster />
    </div>
  );
}
