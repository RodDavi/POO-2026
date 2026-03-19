import React, { useState } from 'react';
import { motion } from 'motion/react';
import { Button } from './ui/button';
import { Input } from './ui/input';
import { Label } from './ui/label';
import { Dog, AlertCircle } from 'lucide-react';
import { toast } from 'sonner@2.0.3';
import type { User } from '../App';

interface LoginProps {
  onLogin: (user: User) => void;
}

// Mock users for demonstration
const mockUsers = [
  { id: '1', name: 'Maria Silva', email: 'secretaria@petshop.com', password: 'secret', role: 'secretary' as const },
  { id: '2', name: 'Dr. João Santos', email: 'vet@petshop.com', password: 'vet', role: 'vet' as const },
  { id: '3', name: 'Admin', email: 'admin@petshop.com', password: 'admin', role: 'admin' as const },
];

export default function Login({ onLogin }: LoginProps) {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [errors, setErrors] = useState({ email: false, password: false });

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    
    // Validate fields
    if (!email || !password) {
      setErrors({
        email: !email,
        password: !password,
      });
      toast.error('⚠ Preencha todos os campos obrigatórios');
      return;
    }

    // Check credentials
    const user = mockUsers.find(u => u.email === email && u.password === password);
    
    if (user) {
      const { password: _, ...userWithoutPassword } = user;
      onLogin(userWithoutPassword);
      toast.success('✅ Login realizado com sucesso!');
    } else {
      setErrors({ email: true, password: true });
      toast.error('❌ Usuário ou senha inválidos');
    }
  };

  return (
    <div className="min-h-screen flex">
      {/* Left side - Illustration */}
      <motion.div 
        initial={{ opacity: 0, x: -50 }}
        animate={{ opacity: 1, x: 0 }}
        transition={{ duration: 0.6 }}
        className="hidden lg:flex lg:w-1/2 bg-gradient-to-br from-[#14213D] to-[#1a2a4d] items-center justify-center p-12"
      >
        <div className="text-center text-white">
          <div className="flex items-center justify-center mb-8">
            <div className="bg-[#FCA311] p-6 rounded-full">
              <Dog size={80} strokeWidth={1.5} />
            </div>
          </div>
          <h1 className="text-4xl mb-4">PetCare System</h1>
          <p className="text-xl opacity-90">Sistema de Agendamento e Gestão</p>
          <p className="mt-4 opacity-75">Modernidade e cuidado para seu pet shop</p>
        </div>
      </motion.div>

      {/* Right side - Login form */}
      <motion.div 
        initial={{ opacity: 0, x: 50 }}
        animate={{ opacity: 1, x: 0 }}
        transition={{ duration: 0.6 }}
        className="w-full lg:w-1/2 flex items-center justify-center p-8"
      >
        <div className="w-full max-w-md">
          <div className="text-center mb-8">
            <div className="lg:hidden flex items-center justify-center mb-6">
              <div className="bg-[#FCA311] p-4 rounded-full">
                <Dog size={48} strokeWidth={1.5} className="text-[#14213D]" />
              </div>
            </div>
            <h2 className="text-3xl text-[#14213D] mb-2">Bem-vindo de volta</h2>
            <p className="text-gray-600">Faça login para acessar o sistema</p>
          </div>

          <form onSubmit={handleSubmit} className="space-y-6">
            <div>
              <Label htmlFor="email">E-mail</Label>
              <Input
                id="email"
                type="email"
                value={email}
                onChange={(e) => {
                  setEmail(e.target.value);
                  setErrors({ ...errors, email: false });
                }}
                className={`mt-1 ${errors.email ? 'border-red-500' : ''}`}
                placeholder="seu@email.com"
              />
              {errors.email && (
                <motion.div 
                  initial={{ opacity: 0, y: -10 }}
                  animate={{ opacity: 1, y: 0 }}
                  className="flex items-center gap-1 text-red-500 text-sm mt-1"
                >
                  <AlertCircle size={14} />
                  <span>Campo obrigatório</span>
                </motion.div>
              )}
            </div>

            <div>
              <Label htmlFor="password">Senha</Label>
              <Input
                id="password"
                type="password"
                value={password}
                onChange={(e) => {
                  setPassword(e.target.value);
                  setErrors({ ...errors, password: false });
                }}
                className={`mt-1 ${errors.password ? 'border-red-500' : ''}`}
                placeholder="••••••••"
              />
              {errors.password && (
                <motion.div 
                  initial={{ opacity: 0, y: -10 }}
                  animate={{ opacity: 1, y: 0 }}
                  className="flex items-center gap-1 text-red-500 text-sm mt-1"
                >
                  <AlertCircle size={14} />
                  <span>Campo obrigatório</span>
                </motion.div>
              )}
            </div>

            <Button 
              type="submit" 
              className="w-full bg-[#FCA311] hover:bg-[#e89300] text-[#14213D] shadow-lg"
            >
              Entrar
            </Button>

            <div className="text-center">
              <button 
                type="button"
                className="text-sm text-[#14213D] hover:underline"
                onClick={() => toast.info('Funcionalidade em desenvolvimento')}
              >
                Esqueci minha senha
              </button>
            </div>
          </form>

          <div className="mt-8 p-4 bg-blue-50 rounded-lg border border-blue-200">
            <p className="text-sm text-gray-700 mb-2">Usuários de demonstração:</p>
            <ul className="text-xs text-gray-600 space-y-1">
              <li>• Secretária: secretaria@petshop.com / secret</li>
              <li>• Veterinário: vet@petshop.com / vet</li>
              <li>• Admin: admin@petshop.com / admin</li>
            </ul>
          </div>
        </div>
      </motion.div>
    </div>
  );
}
